import java.io.*; 
import javax.swing.*; // Gui ±¸Çö  


	public class File_Choose_GUI {
		public static void main(String[] args) throws IOException {
			
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Select the file which you want to copy.");
		
		int result = chooser.showDialog(null, "Copy");
		
		if(result != JFileChooser.APPROVE_OPTION) 
		System.exit(0);
		
		String f = chooser.getSelectedFile().toString();
		
		BufferedReader infile = new BufferedReader(new FileReader(f));
		
		PrintWriter outfile = new PrintWriter(new FileWriter(f + ".out"));
		
		while (infile.ready()) {
			outfile.println(infile.readLine());
		}
		infile.close();
		outfile.close();
	}
}


	
