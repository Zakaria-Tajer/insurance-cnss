package com.cnss.Controllers;

import Dao.*;
import Models.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import utils.Data;

import java.util.*;

@Controller
@Scope("session")
public class TestController {

    private ApplicationContext conn;

    @RequestMapping("/home")
    public String viewHome(Model model) {
        return "home";
    }

    @RequestMapping("/addFolder")
    public String getAddFolder(Model model, Patient patient) {
        conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        PatientDao obj = conn.getBean("patientDao", PatientDao.class);
        DoctorDao doctorObject = conn.getBean("doctorDao", DoctorDao.class);
        RadioDao radioObject = conn.getBean("radioDao", RadioDao.class);
        AnalysisDao analysisObject = conn.getBean("analysisDao", AnalysisDao.class);


        model.addAttribute("patientList", obj.getPatients());
        model.addAttribute("doctorList", doctorObject.getDoctors());
        model.addAttribute("radios", radioObject.getRadios());
        model.addAttribute("analysis", analysisObject.getAnalysis());
        return "addFolder";
    }

    @RequestMapping("/dashboard")
    public String getDashboard(Model model) {
        return "dashboard";
    }


    @RequestMapping("/register")
    public String viewRegister(Model model) {
        conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Agent agent = conn.getBean("agentInfo", Agent.class);
        model.addAttribute("bean", agent);
        return "register";
    }


    @RequestMapping("/AgentLogin")
    public String loginAgent(@RequestParam("email") String email, @RequestParam("password") String password, @ModelAttribute("bean") Agent agent, Model model, HttpServletRequest request
    ) {
        conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Data utils = new Data();
        AgentDao obj = conn.getBean("agentDao", AgentDao.class);
        List<Object[]> rows = (List<Object[]>) obj.getAgent(email, password);

        String agentEmail = "";
        String agentPassword = "";
        String agentUniqueId = "";
        for (Object[] row : rows) {
            agentEmail = row[0].toString();
            agentPassword = row[1].toString();
            agentUniqueId = row[2].toString();

            System.out.println(row[1].toString());
        }

        if (password.equals(agentPassword) && email.equals(agentEmail)) {
            request.setAttribute("unique_id", agentUniqueId);
            return "dashboard";
        }

        model.addAttribute("msg", "success");


        return "register";
    }


    @RequestMapping("/saveDossier")
    public String saveDossier(Model model, @RequestParam("patient") int id,
                              @RequestParam("doctor") int doctorId,
                              @RequestParam("radio") int radioId,
                              @RequestParam("analysis") int analysisId
    ) {
        Dossier dossiers = new Dossier();
        conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DossierDao dossier = conn.getBean("dossierDao", DossierDao.class);

        dossiers.setPatient(id);
        dossiers.setDoctorId(doctorId);
        dossiers.setRadio(radioId);
        dossiers.setAnalysis(analysisId);

        dossier.saveDossier(dossiers);

        System.out.println(id + " " + doctorId + " " +radioId + " " + analysisId);
        return "addFolder";
    }



}
