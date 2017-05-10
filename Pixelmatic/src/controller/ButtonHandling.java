package controller;


import java.io.IOException;
import model.ColorEffects;
import model.ContourEffects;
import model.FlouEffects;
import model.IOFile;
import model.ModifyPath;
import view.InterfaceView;

public class ButtonHandling {
	
	public static void showBaseImage(){
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		InterfaceView.showImage(WorkArea.getBaseImagePath());
	}
	public static void useBlackAndWhiteEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		String baseImagePath=WorkArea.getBaseImagePath();
		// to hide image
		//String currentImagePath=ModifyPath.hideFilePathName(ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp"));
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		IOFile.askcopy(baseImagePath,currentImagePath);
		
		WorkArea.setCurrentImagePath(currentImagePath);
		
		ColorEffects.applyBlackAndWhiteEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	public static void useGaussianEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		WorkArea.setCurrentImagePath(currentImagePath);
		
		FlouEffects.applyGaussianEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	
	public static void useBlurEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		
		WorkArea.setCurrentImagePath(currentImagePath);
		
		FlouEffects.applyBlurEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	
	public static void useSepiaEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		WorkArea.setCurrentImagePath(currentImagePath);
		
		ColorEffects.applySepiaEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	
	public static void useNegativeEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		WorkArea.setCurrentImagePath(currentImagePath);
		
		ColorEffects.applyNegativeEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	public static void useAccentuationEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		WorkArea.setCurrentImagePath(currentImagePath);
		
		ContourEffects.applyAccentuationEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
	
	public static void useEstampageEffect() throws IOException{
		
		if (WorkArea.getBaseImagePath()==null){
			InterfaceView.showErrorMessage("Choisissez d'abord une image");
			return;
		}
		
		String baseImagePath=WorkArea.getBaseImagePath();
		String currentImagePath=ModifyPath.addToPath(WorkArea.getBaseImagePath(),"_tmp");
		
		IOFile.askcopy(baseImagePath,currentImagePath);
		WorkArea.setCurrentImagePath(currentImagePath);
		
		ContourEffects.applyEstampageEffect(currentImagePath);
		
		InterfaceView.showImage(WorkArea.getCurrentImagePath());
	}
}
