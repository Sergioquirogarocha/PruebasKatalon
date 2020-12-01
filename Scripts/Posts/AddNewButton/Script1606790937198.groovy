import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Se ingresa al navegador por defecto\r\n'
WebUI.openBrowser('https://s1.demo.opensourcecms.com/wordpress/wp-login.php')

'maximiza el navegador\r\n'
WebUI.maximizeWindow()

'Se selecciona el campo de usuario\r\n'
WebUI.click(findTestObject('Login/InputUserName'))

'Se ingresa el usuario'
WebUI.setText(findTestObject('Login/InputUserName'), 'opensourcecms')

'Se selecciona el campo de contraseña\r\n'
WebUI.click(findTestObject('Login/InputPassword'))

'Se ingresa la contraseña'
WebUI.setText(findTestObject('Login/InputPassword'), 'opensourcecms')

'Se selecciona el boton de ingreso'
WebUI.click(findTestObject('Login/ButtonLogin'))

WebUI.verifyElementPresent(findTestObject('Main Page/WelcomeMenu'), 5)

WebUI.click(findTestObject('Options/MenuPost'))

WebUI.verifyElementPresent(findTestObject('Interfaces/InterfacePost'), 3)

WebUI.click(findTestObject('AddNew/AddNewPost'))

WebUI.verifyElementPresent(findTestObject('NewPost/AddTitlePost'), 3)

