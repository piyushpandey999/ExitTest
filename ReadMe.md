# ReadMe

1. Download the project and open it in Eclipse or IntelliJ.
2. All the dependencies are in the pom.xml and automatically downloaded when the project is built.
3. All the global data is stored under the config file such as browser name, mode, base URL etc.
4. To change the browser simply change the browser name in config.properties.
5. **Please update your Flipkart Credentials in the data.xlsx file to run login related test cases.**
6. Setup Page file under the Base package contains code to initialize the browser and open base URL.
7. Pages package contains different page files for each test case which contains the xpath of the elements and the methods that performs operation on that element.
8. Utilities package contains Jar, Extent Manager, Generic, ReadExcelData, ReadingPropertiesFile, ScreenShots files.
9. Jar folder contains reusables libraries which is already imported in the current project.
10. Extent Manager file is used to generate the report.
11. Generic file contains reusable method to click on cross button of login popup.
12. Reading Properties file is used to read the data from config.properties file.
13. Screenshot file is used to take the screenshots where the test cases failed.
14. Resources folder contains Driver folder which contains chrome, edge, Firefox driver and Data.xlsx contains the login credentials of the user.
15. All the test cases are stored under the test directory.
16. Logs are implemented in the test cases using Log4j.
17. Test report is being created after running the test cases in the reports directory.
18. Screenshot of the failed test case is generated in the root folder.
19. To run the Tests, you can either run the tests separately or you can run the testing.xml to run all the testcases at once.