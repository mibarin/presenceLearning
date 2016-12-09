# presenceLearning
The first test checks if the filter bar and the 3 filter elements, category dropdown, condition dropdown, text field are present.
The second check depends on the first check to be completed.  It loads the category name labels for the category dropdown.  It checks
the specified categories exist on the drop down.  It doesn't check the number of items listed on the dropdown, which I thought it would be good to implement.
The third check that I couldn't implement is to check the default texts that appears on the search text field depending on the selected category.


Set up:

Environment: Windows 7
Eclipse Luna Service Release 2 (4.4.2) with Maven and TestNG Plugin installed
Java:
FireFox: 
Maven: If you do not have it for eclipse, please see http://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation

To Run the project:
1. At https://github.com/mibarin/presenceLearning, click "Clone or download" button.  
2. Click on the clipboard icon on the right of the URL.
3. On Git Shell, move to your preferred directory to download the project by cd command.
4. Type "git clone " and paste the URL.  Hit Enter/Return.
5. Launch Eclipse
6. Select File-> Import -> Maven -> Existing Maven Projects.  Click Next.
5. Brouse to the directory where the project is downloaded.
6. Confirm that the project is shown on the Projects text box.  Check it anRid click Finish.
7. On Package Explorer, confirm the project is shown.
8. Go down to src/test/java -> org.akiko.presencelarening.assignment.plpatternlibpage -> FilterTest.java
9. Right-Click on FilterTest.java.  Select Run As -> TestNG Test.

Something I struggled:
1. Coding took a little over 2 hours because I had trouble with getting elements at first.  Additionally, I had a string comparison problem, 
whose root cause was that I often mixed up languages and I didn't realize str.equals is needed to check.  I pend exra time on debugging.
2. I didn't have experience runnning a maven project from GitHub on eclipse, it took a bit of time to research and make it work.
