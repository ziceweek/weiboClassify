package preprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ReadWeibo {
	
	 public static void ReadWeibo(String dir){
			
			//��ȡ�ļ�
			String source = "";
			try{
				File file = new File(dir);
				FileInputStream input = new FileInputStream(file);
				InputStreamReader read =new InputStreamReader(input,"UTF-8");
				BufferedReader reader = new BufferedReader(read);
				String strTemp= "";
				int i = 0;
				while(true){
					i++;
					strTemp = reader.readLine();
					System.out.println(i);
					if(strTemp == null)
						break;
					source += strTemp+"\n";
				}
				
				//���ı�����Ԥ����
				source = source.replaceAll("<id>.*?</id>\n", "");
				source = source.replaceAll("<discuss>.*?</discuss>\n", "");
				source = source.replaceAll("<insertTime>.*?</insertTime>\n", "");
				source = source.replaceAll("<origin>.*?</origin>\n", "");
				source = source.replaceAll("<person_id>.*?</person_id>\n", "");
				source = source.replaceAll("<time>.*?</time>\n", "");
				source = source.replaceAll("<transmit>.*?</transmit>\n", "");
				source = source.replaceAll("<.*?>", "");
				//source = source.replaceAll("[0-9]{2}:[0-9]{2}:[0-9]{2}", "");
				
				//File file2 = new File("F:/talk/output.xml");
				//FileOutputStream output = new FileOutputStream(file2);
				//OutputStreamWriter write =new OutputStreamWriter(output,"UTF-8");
				//BufferedWriter writer = new BufferedWriter(write);
				//writer.write(source);
				//writer.close();
				
				//��ԭʼ�ı��ָ���� 
				//String[] nodeArray = source.split("\n");	
				System.out.print("����"+source);

				
				}catch(FileNotFoundException ex){
					System.out.print("�Ҳ����ļ�");
				}catch(Exception ex2){
					System.out.print("δ֪����");
				}
		}

	 public static void main(String[] agrs){
		 ReadWeibo("F:/talk/test.xml");
	 }
}
