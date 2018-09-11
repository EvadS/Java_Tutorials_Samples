package com.example.demo.controller;

import com.example.demo.data.CompanyDAO;
import com.example.demo.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


import java.io.IOException;
import java.util.List;

@RestController
public class ServiceController {

  /*  @Autowired
    private CompanyDAO companyDAO;

    @Autowired
    private View jsonView;

    private static final Logger logger_c = Logger.getLogger(ServiceController.class);

    private final String DATA_FIELD ="data";
    private final String ERROR_FIELD = "error";

    /**
     * Create an error REST response.
     * @param errMsg,error message
     * @return model and view
     */
  /*  private ModelAndView errorResponder(String errMsg) {
        return new ModelAndView(jsonView, ERROR_FIELD, errMsg);
    }*/

    /**
     * Gets all companies.
     * @return the list of companies.
     */
  /*  @RequestMapping(value ="/getcompanyall/", method = RequestMethod.GET)
    public ModelAndView getcompanyall() throws IOException
    {
        System.out.println("Inside getCompanyAll()");
        List<Company> companyList = null;

        try {
            companyList = companyDAO.list();
        } catch (Exception exception) {
            String errMsg = "Error getting all companies.";
            return errorResponder(String.format(errMsg, exception.toString()));
        }

        logger_c.debug("Returing CompanyList: " + companyList.toString());
        return new ModelAndView(jsonView, DATA_FIELD, companyList);
    }*/
}
