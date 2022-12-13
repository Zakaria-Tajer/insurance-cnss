<%--
  Created by IntelliJ IDEA.
  User: cosmic
  Date: 12/6/22
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<div class="relative flex min-h-screen text-gray-800 antialiased flex-col justify-center overflow-hidden bg-gray-50 py-6 sm:py-12">
    <div class="relative py-3 sm:w-96 mx-auto text-center">
        <span class="text-2xl font-light ">Login to your account</span>
        <div class="mt-4 bg-white shadow-md rounded-lg text-left">
            <div class="h-2 bg-purple-400 rounded-t-md"></div>
            <form action="AgentLogin" method="post" class="space-y-4">
                <div class="px-8 py-6 ">
                    <label class="block font-semibold">Email </label>
                    <input name="email" type="text" placeholder="Email" class="border w-full h-5 px-3 py-5 mt-2 hover:outline-none focus:outline-none focus:ring-indigo-500 focus:ring-1 rounded-md">
                    <label class="block mt-3 font-semibold">Password</label>
                    <input name="password" type="password" placeholder="Password" class="border w-full h-5 px-3 py-5 mt-2 hover:outline-none focus:outline-none focus:ring-indigo-500 focus:ring-1 rounded-md">
                    <input type="submit" value="login" class="w-40 py-3 rounded-md mt-4 bg-blue-500 hover-bg-blue-400">
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
