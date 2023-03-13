using Microsoft.AspNetCore.Mvc;
namespace FirstWebApp.Controllers;     //be sure to use your own project's namespace!
    public class HomeController : Controller   //remember inheritance??
    {
        //for each route this controller is to handle:
        [HttpGet]       //type of request
        [Route("")]     //associated route string (exclude the leading /)
        public string Index()   // landing page
        {
            return "Hello World from HomeController!";
        }

        // can also do 
        [HttpGet("/hello")] // for index/hello page, always in lower case
        public string Hello(){
            return "Hello from single bracket";
        }
    }

