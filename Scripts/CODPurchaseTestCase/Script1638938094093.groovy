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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ie-104-flower-shop-fe-konsept-store.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Konsept/svg'))

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Username_MuiOutlinedInput-input MuiIn_c5d559'), 'annhienkt1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Konsept/input_Password_MuiOutlinedInput-input MuiIn_ae054b'), 
    '391WRAcRvROQWKPTiPGB5Q==')

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_2'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/input_YOUR CART_PrivateSwitchBase-input css_015900'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Username_MuiOutlinedInput-input MuiIn_c5d559'), '123 Vietnam')

WebUI.click(findTestObject('Object Repository/Page_Konsept/body_You need to enable JavaScript to run t_ca504d'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/li_Tnh Kon Tum'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/body_You need to enable JavaScript to run t_ca504d_1'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/li_Thnh ph Kon Tum'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/body_You need to enable JavaScript to run t_ca504d_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/li_Phng Duy Tn'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/input_Notes_save'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Confirm Order'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/p_Last updated less than a minute ago'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/span_Processing'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ie-104-flower-shop-fe-konsept-store.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Konsept/svg'))

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Username_MuiOutlinedInput-input MuiIn_c5d559'), 'annhienkt1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Konsept/input_Password_MuiOutlinedInput-input MuiIn_ae054b'), 
    '391WRAcRvROQWKPTiPGB5Q==')

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/input_YOUR CART_PrivateSwitchBase-input css_015900'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Use your default delivery information'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Confirm Order'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/div_Order ID 61b038020107f68c66c3d186Last u_be7209'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/span_Processing'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/p_Last updated less than a minute ago'))

WebUI.closeBrowser()

