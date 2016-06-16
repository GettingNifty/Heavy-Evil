# Heavy-Evil
Application/Web Forum/Game Framework Template


SDK's currently used in project development.

JOGL 2.3+(Includes all current OpenGL bindings),
MySQL Connector/J 5.1+,
Spring 4.4+(for later stages, meant to be used when hosting your own servers),
JRE and JDK 1.8+ System Library(Java SE 8) but was originally built on JDK and RE 1.6,
JSoup 1.8.3(currently unused), and Java3D(unused at this point, but included in the Java standard library)for a higher level graphics library that is meant to scale multiplayer online games quickly, to be used on top of JOGL for more simplicity.  


  You're going to need to install the Java JDK's and RE's in your environment or IDE. I currently use Eclipse Luna IDE which I would recommend. You only need to add the external jar files from your project build settings and create an Images folder within the project for your image sources. The background of the login window streams a live html template from a website.  

  The project is an open source game template for developers who want to build a fully functional OpenGL based application or cross-platform game, with this being the PC Version. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console. The project will eventually be connected to a forum website using Java Servlets and JSP(refer to the webpage heavyevil.gq). I plan to also incorporate Microsofts Kinect technology, the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot most likely using node.js api or there may be a JDK. 

  -Removed Maven from project. If you haven't installed or used Maven before ignore this. It showed instability when updating the pom.xml file and corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt all of your files. 
