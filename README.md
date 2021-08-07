# ABC Technical Assessment
technical asssement for the software developer role  

 **instructions for booting up the project**  
 The project above depends on postgres database. `Please note that running the application before starting the postgres database will cause unnecessary failures`  
 The following are the steps to ensure proper spring boot initilization:
 
 _The instructions presume that you have cloned or forked the project to your local computer_  
 
 ## steps  
 - cd to the root folder of the project
 - Locate the bin folder, and `cd to it`, the execute this command ```sudo chmod +x *.sh ```. This will set the executable on all `.sh`.
 - The files contain instructions to install postgres database container via docker. *Its is very mandatory to have docker installed*
 
  >Incase you do not have docker installed but have postgres running on your computer :-
  > Open the project with your favourite IDEA and change the `applications.properties` to point to your postgres instance.
  
  - After docker installs postgres successfully, Proceed to the application source code, Open it with your editor and start the main function
  
  *The application should starts successfully after establishing a connection to postgres data source*
  
  To view the application on the web, please note *I have manually overrriden the default port `8080` to port `3400`*. open your browser and 
  
  > http://localhost:3400/users  
  
  
  # Steps to create a USSD Application
  
  To create a UUSD application, first as a client you must register for a ussd or a sender Id from available sms providers i.e SynqAfrica, Africa`s Talking and others not mentioned
  Please not the two might have very different functionalities depending on the use case but some major differences include  
  
   | USSD | SENDER ID |
| ------ | ------ |
|A USSD acquisation and maintainace is very relatively expensive| A sender ID si easy to acquire and very cheap to use|
|Some USSD have capability to receive text messages from phone numbers |No capability to receive text from phone numbers|
|A conversation session ID is maintained by the sms provider and sent as part of the payload in JSON data|No session is created, To achieve this kind of capability, a developer must expilicitly design a system using either redis or a message Q to handle session and state management

## System development plan and design
- Request for the API documentation from the company managing the USSD.
- Create your system service to fulfil design requirements, this can be either sending an alert, or an OTP system.
- Configure a message queue and assign a topic to handle messaging production and consumption
>Ideally, the system created above should be able to consume the messages posted by other producers in the queue. This ensures very high scalability incase another functionality to use the USSD is conceptualized later.


`The use of a message queue in this design helps to ensure, messages not sent via the USSD are retried, easy monitoring incase retry limti is hit, and flexibility in future use cases`

> For USSDs that are able to send and receive text messages, depending on the use case, access to the session key that is mostly maintained and provided by the provider
> helps ensure you can create a USSD service e.g `balance checks`, `customer care request` and even `a conversational bot system` that can follow normal conversation request response format  _but at the same time you have to keep 
in mind that the maximum amount of time the session is maintained is *45 seconds*_.


## App Mobile Design  

The steps outlined below will cover both for Cross platform `React native` and `Native Java` which are my preferred stacks.

Initial stages of App development involve 
- Application purpose and client specification recon.
- After fully understanding the Application general outlook and purpose, I usually use Adobe XD to generate rough UI designs and color palletes.
- I will then request the client input on them, then after approval, i will go back to Adobe XD and generate responsive image Assets for things like `Home page banner`, `Not found avatar`
`user avatar` e.t.c
## _For native Android_

Preferred editor is android studio.
 - Start a new project on android studio.
 - Register for API keys if the project requires them, i.e `firebase storage and database`, `google maps Api keys`, `facebook OAuth keys` e.t.c
 - Import necessary assets resource to my assest folder.This include things like `images`, `custom fonts`, `svgs` and others.
 - Database design if the app requires one.
 - At this stage, am usually done with initial stages, now i will start source code development while doing local testing on my device. 
 - At every end of a week, i create a debuggable aplication and send it to my client for review and design changes.
 
 ## _For react native_
 
 > Similar design and development strategies but i usually use VsCode for development
 
 

 

