package segmentation;



import java.io.IOException;

import kevin.zhang.NLPIR;

public class Segmentation {
	public static String[] segmentation(String source){
		try{
			String path = "./2013Data";
			path = path.concat(".");//��ʼ��ICTCLAS��·��
			NLPIR	nlpir = new NLPIR();
			if(NLPIR.NLPIR_Init(path.getBytes("GBK"),0)==false){
				System.out.print("��ʼ��ʧ��");
				return null;
			}else{
				System.out.println("��ʼ���ɹ�");
			}

			//����
			byte nativeBytes[] = nlpir.NLPIR_ParagraphProcess(source.getBytes("GBK"),0);
			String nativeString = new String(nativeBytes,"GBK");
			System.out.print(nativeString);

			String[] words = nativeString.split(" ");
			
		System.out.print(words);
		    return words;//��һ��String�Ĺ��캯��  ֻҪ���ݾ�����  ��Ҫ���߰���ĳ��ȱ��뷽ʽʲô�ģ���Ҫ�����ǲ��Ǳ���ָ�����뷽ʽ
		}catch(IOException ex){
			System.out.print("something must be wrong");
			return null;
		}
	
	}
	
	//��ʾ�ִʽ��
	//public static void main(String[] agrs){
	//	segmentation("������ʲô����");
	//}
}
