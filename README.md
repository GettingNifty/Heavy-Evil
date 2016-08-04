# Heavy-Evil
Application/Web Forum/Game Framework Template

SDK's currently used in project development. 

JOGL 2.3,

MySQL Connector/J 5.1,

JRE and JDK 1.8 System Library(Java SE 8) but was originally built on JDK and RE 1.6,

Spring 4.4(for much later stages, meant to be used when hosting the game your own servers, for instance rather than using hosting websites),

JSoup 1.8.3(currently unused but for HTML parsing)


Java3D 1.5.1(listed in the Java standard library but not included)for a higher level graphics library that is meant to scale multiplayer online games quickly, to be used on top of JOGL for more simplicity. Java3D is already installed but heavily outdated on many Mac OS X versions, and so it causes problems for me in Eclipse currently. These files are located under /System/Library/Java/Extensions and are accessible via the command shell by typing "cd /" and then "ls", "cd System", etc., and "open Extensions". For Windows the tutoral seems to be to add the .bin file under native libraries under user libraries. I also need to see if there's a way to install a JRE in eclipse for Java3D. I am using Mac OS X Lion 10.7.5 with 4 GB's of RAM and stock VRAM and a 32/64 bit hybrid Core 2 Duo processor which is nothing fancy but handles the rendering very well.

I currently use Eclipse Luna IDE which I would recommend. You only need to add the external jar files from the JDK of your choice and possibly user a JRE if you want to develop 1.8 programs on 1.6 or Blackberry, Android JRE's. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and create an Images folder within the project for your image sources. I will also being storing my object models in the Images folder. The background of the login window streams a live website url. You can change it in the code, but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups on the free tier. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 5 dollars a month.  

This project is an open source game template for developers who want to build a fully functional OpenGL based application that's easily portable to other systems. Everything has it's own windowing toolkit. This project uses Swing and AWT. The graphics can be saved and converted in many different file formats. Models can be easily created with 3rd party software like AutoDesk Maya or Blender. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot most likely using node.js api or there may be a JDK. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. It showed instability when updating the pom.xml file and corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker for the moment and put my sql connection in the main file because I am still practicing multithreading.
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone, allowing all connections. MySQL only allows connections through port 3306 so you can use the same EC2 instance and Security group. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called, and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. 

