package com.spring_demo_azure.AzureProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping("/message")
    public String message()
    {
        return "Congratulations your project is deployed to Azure !!";
    }
}
