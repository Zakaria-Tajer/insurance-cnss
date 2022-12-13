<%@ page import="java.util.List" %>
<%@ page import="com.cnss.Controllers.TestController" %>
<%@ page import="Models.Patient" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: cosmic
  Date: 12/13/22
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>

</head>
<body>



<div class="w-full min-h-screen flex ">

    <aside class="w-64 " aria-label="Sidebar">
        <div class="overflow-y-auto h-full py-4 px-3 bg-gray-50 rounded dark:bg-gray-800">
            <ul class="space-y-2">
                <li>
                    <a href="dahsboard"
                       class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                        <svg aria-hidden="true"
                             class="w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                             fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                            <path d="M2 10a8 8 0 018-8v8h8a8 8 0 11-16 0z"></path>
                            <path d="M12 2.252A8.014 8.014 0 0117.748 8H12V2.252z"></path>
                        </svg>
                        <span class="ml-3">Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="addFolder"
                       class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                        <svg aria-hidden="true"
                             class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                             fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                            <path d="M5 3a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2V5a2 2 0 00-2-2H5zM5 11a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2v-2a2 2 0 00-2-2H5zM11 5a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2V5zM11 13a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2v-2z"></path>
                        </svg>
                        <span class="flex-1 ml-3 whitespace-nowrap">Add Folder</span>
                        <span class="inline-flex justify-center items-center px-2 ml-3 text-sm font-medium text-gray-800 bg-gray-200 rounded-full dark:bg-gray-700 dark:text-gray-300">Pro</span>
                    </a>
                </li>

            </ul>
        </div>
    </aside>

    <div class="w-5/6  min-h-screen flex justify-center items-center">
        <div class="w-1/2 bg-white py-2 shadow-md rounded-md space-y-10">
            <h1 class="text-center text-xl">Add Folder</h1>

            <div class="mt-2 space-y-3 flex items-center flex-col justify-center">
                <div class="w-full flex items-center flex-col justify-center">
                    <h1 class="text-left text-semibold">Patient Name </h1>
                    <select class="w-1/2 rounded py-2 bg-gray-200 px-4">

                        <%
                            List<Object[]> patientRows = (List<Object[]>) request.getAttribute("patientList");
//                            Object[] row : rows

                            for (Object[] row : patientRows){

                        %>

                        <option> <%= row[0].toString() %></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <div class="w-full flex items-center flex-col justify-center">
                    <h1 class="text-left text-semibold">Doctor </h1>
                    <select class="w-1/2 rounded py-2 bg-gray-200 px-4">
                        <%
                            List<Object[]> doctorRows = (List<Object[]>) request.getAttribute("doctorList");
                            for (Object[] row : doctorRows){

                        %>

                        <option> <%= row[0].toString() %></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <div class="w-full flex items-center flex-col justify-center">
                    <h1 class="text-left text-semibold">Radio </h1>
                    <select class="w-1/2 rounded py-2 bg-gray-200 px-4">
                        <%
                            List<Object[]> radioRows = (List<Object[]>) request.getAttribute("radios");
                            for (Object[] row : radioRows){

                        %>

                        <option> <%= row[0].toString() %></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <div class="w-full flex items-center flex-col justify-center">
                    <h1 class="text-left text-semibold">Analysis </h1>
                    <select class="w-1/2 rounded py-2 bg-gray-200 px-4">
                        <%
                            List<Object[]> analysisRows = (List<Object[]>) request.getAttribute("analysis");
                            for (Object[] row : analysisRows){

                        %>

                        <option> <%= row[0].toString() %></option>
                        <%
                            }
                        %>
                    </select>
                </div>

                <button class="py-2 px-14 bg-indigo-600 rounded-md">Submit</button>
            </div>


        </div>

    </div>

</div>
</body>
</html>
