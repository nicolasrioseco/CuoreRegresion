package Bienes.Modelo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.waitCuore;

public class AccesoABMModelo {
	
	public void abmModelo(WebDriver driver, WebDriverWait wait) throws InterruptedException{    
    
		/*             Acceso al ABM Clases         */
    
    
	    //espera a que exista y cliquea sobre el boton de la sección de Configuraciones
	    Thread.sleep(1000);
		waitCuore.repited(driver, wait);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("mainMenuConfiguracion")));
	    waitCuore.repited(driver, wait);
	    driver.findElement(By.id("mainMenuConfiguracion")).click();
	    //espera a que exista y cliquea sobre el boton para desplegar las opciones de Bienes
	    waitCuore.repited(driver, wait);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("subMenuBienes")));
	    driver.findElement(By.id("subMenuBienes")).click();
	    Thread.sleep(1000);
	    //espera a que exista y cliquea sobre el boton para acceder al ABM de Modelo
	    waitCuore.repited(driver, wait);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("menuModelo")));
	    driver.findElement(By.id("menuModelo")).click();
	}
}