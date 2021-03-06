package com.template

import net.corda.core.contracts.*
import net.corda.core.identity.Party
import net.corda.core.transactions.LedgerTransaction

// *****************
// * Contract Code *
// *****************
// This is used to identify our contract when building a transaction
val IOU_CONTRACT_ID = "com.template.IOUContract"

class IOUContract : Contract {
    // Our Create command.
    class Create : CommandData

    override fun verify(tx: LedgerTransaction) {
        val command = tx.commands.requireSingleCommand<Create>()

        requireThat {
            // Constraints on the shape of the transaction.
            "No inputs should be consumed when issuing an IOU." using (tx.inputs.isEmpty())
            "There should be one output state of type IOUState." using (tx.outputs.size == 1)

            // IOU-specific constraints.
            val out = tx.outputsOfType<IOUState>().single()
            "The IOU's value must be non-negative." using (out.value > 0)
            "The lender and the borrower cannot be the same entity." using (out.lender != out.borrower)

            // Constraints on the signers.
            "There must be two signers." using (command.signers.toSet().size == 2)
            "The borrower and lender must be signers." using (command.signers.containsAll(listOf(
                    out.borrower.owningKey, out.lender.owningKey)))
        }
    }
}

// *********
// * State *
// *********
class IOUState(val value: Int,
               val lender: Party,
               val borrower: Party) : ContractState {
    override val participants get() = listOf(lender, borrower)
}