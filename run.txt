set projectLocation=C:\Users\user\eclipse-workspace\oneproject\MAGNQ_orangehrm
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\NewFilesuit.xml
