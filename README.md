<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/jonasmzsouza/ds-send-email?style=flat-square&color=f1783f">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jonasmzsouza/ds-send-email?style=flat-square&color=1f6feb">
  <a href="https://github.com/jonasmzsouza/ds-send-email/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jonasmzsouza/ds-send-email/main?style=flat-square&color=2f74c0">
  </a>
</p>

<hr>

<p align="center">
  <a href="#-about-the-project">About</a> |
  <a href="#-technologies">Technologies</a> | 
  <a href="#-how-to">How to</a> | 
  <a href="#-author">Author</a> 
</p>

## 💻 About the project

Project developed through the implementation of Java code with Spring Boot structure as content for course integrations at [DevSuperior](https://devsuperior.com.br/).<br>
RESTful API for sending email via the SendGrid API.

## 🛠 Technologies

Technologies and tools that were used in the development of the project:

### **Languages | Environments | Frameworks | Libraries | Techniques**

- Java
- Spring Boot 3
- Spring Web
- SendGrid API

### **Utilities**

- Editor: **[IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/)**
- Emojis: **[Emoji Cheat Sheet](https://github.com/ikatyang/emoji-cheat-sheet)**, **[Markdown Emoji](https://gist.github.com/rxaviers/7360908)**
- Shields: **[Shields](https://shields.io/)**

---

## 🔧 How to

### Requirements
- Java 21
- SendGrid API Key

### SendGrid configuration
1. Create a [SenGrid account](https://sendgrid.com/)
2. Configure [Sender Authentication](https://app.sendgrid.com/settings/sender_auth)
3. Create the API key using the [Integration Guide (recommended)](https://app.sendgrid.com/guide/integrate) or [API Keys Panel](https://app.sendgrid.com/settings/api_keys)
4. Set the environment variable with the name `SENDGRID_API_KEY` and the value of the api key.

### Application installation
1. clone repo
2. open project folder from file system
3. change spring profile to 'dev' in `application.properties`
4. run app `Application.java`
5. test the `http://localhost:8080/emails` resource with your api test application

```
{
    "fromEmail" : "verifiedsender@yourdomain.com",
    "fromName" : "Name of Sender",
    "replyTo" : "reply@yourdomain.com",
    "to" : "recipient@domain.com",
    "subject" : "My Subject",
    "body" : "My email content with <strong>strong words</strong> highlighted.",
    "contentType" : "text/html"
}
```

---

## 👨‍💻 Author

<table>
  <tr>
    <td align="center">
      <a href="https://jonasmzsouza.github.io/">
         <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/61324433?v=4" width="100px;" alt=""/>
         <br />
         <sub><b>Jonas Souza</b></sub>
      </a>
    </td>
  </tr>
</table>
 
[![Github Badge](https://img.shields.io/badge/-jonasmzsouza-3e4957?style=flat-square&logo=Github&logoColor=white&link=https://github.com/jonasmzsouza)](https://github.com/jonasmzsouza) [![Linkedin Badge](https://img.shields.io/badge/-jonasmzsouza-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jonasmzsouza/)](https://www.linkedin.com/in/jonasmzsouza/)
