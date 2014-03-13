package segmentation;



import java.io.IOException;

import kevin.zhang.NLPIR;

public class Segmentation {
	public static String[] segmentation(String source){
		try{
			String path = "./2013Data";
			path = path.concat(".");//初始化ICTCLAS的路径
			NLPIR	nlpir = new NLPIR();
			if(NLPIR.NLPIR_Init(path.getBytes("GBK"),0)==false){
				System.out.print("初始化失败");
				return null;
			}else{
				System.out.println("初始化成功");
			}

			//分析
			byte nativeBytes[] = nlpir.NLPIR_ParagraphProcess(source.getBytes("GBK"),0);
			String nativeString = new String(nativeBytes,"GBK");
			System.out.print(nativeString);

			String[] words = nativeString.split(" ");
			
		System.out.print(words);
		    return words;//查一下String的构造函数  只要内容就行了  不要乱七八糟的长度编码方式什么的，但要看下是不是必须指定编码方式
		}catch(IOException ex){
			System.out.print("something must be wrong");
			return null;
		}
	
	}
	
	//显示分词结果
	//public static void main(String[] agrs){
	//	segmentation("今天是什么日子");
	//}
}
