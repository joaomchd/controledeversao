/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeversao;

/**
 *
 * @author João Victor Machado
 */
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
*/  
    public class ControleDeVersao {
        public ControleDeVersao(){
            //System.out.println("Test.Test()");
        }

        public static void main(String[] args) throws Exception {
            HomeJFrame view = new HomeJFrame();
            view.setVisible(true);
          /*  
            BufferedReader br1 = null;
            BufferedReader br2 = null;
            String sCurrentLine;
            List<String> list1 = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            br1 = new BufferedReader(new FileReader("C:\\Users\\João Victor Machado\\Documents\\teste\\texto1.php"));
            br2 = new BufferedReader(new FileReader("C:\\Users\\João Victor Machado\\Documents\\teste\\texto2.php"));
            while ((sCurrentLine = br1.readLine()) != null) {
                list1.add(sCurrentLine);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                list2.add(sCurrentLine);
            }
            List<String> tmpList = new ArrayList<String>(list1);
            tmpList.removeAll(list2);

            //System.out.println("Diferenças entre segundo arquivo e primeiro arquivo:");
            String test = "";
            tmpList = list2;
            tmpList.removeAll(list1);
            for(int i=0;i<tmpList.size();i++){
                if(test == ""){
                test = tmpList.get(i);
                }else{
                    test = test + "\n" + tmpList.get(i);
                }
                    
                //System.out.println(tmpList.get(i)); //content from test2.txt which is not there in test.txt
            }
            //System.out.println(test);*/
        }
    }