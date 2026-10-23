package praktikum3;

import javax.swing.JOptionPane;

public class message {

	public static void main(String[] args) {
		JOptionPane jop= new JOptionPane();
		
//		jop.showMessageDialog(null, "hello","Pesan penting",jop.WARNING_MESSAGE);
		
//		String nama=jop.showInputDialog(null,"Masukan nama anda");
//		jop.showMessageDialog(jop, nama);
		
//		int confirm=jop.showConfirmDialog(null, "apakah ini kelas pbo",
//								"konfirmasi",jop.YES_NO_CANCEL_OPTION);
//		if(confirm==1) {
//			jop.showMessageDialog(null, "anda pilih no");
//		}else {
//			jop.showMessageDialog(null, "anda pilih yes");
		
//	    }
		
		String input = JOptionPane.showInputDialog(null,"Masukan umur anda");
		
		int umur = Integer.parseInt(input);
		

		if(umur>=
				17) {
			JOptionPane.showMessageDialog(null, "selamat datang");
		}else {
			JOptionPane.showMessageDialog(null, "maaf, umur anda belum cukup");
		
			}
		
		
	}
}

