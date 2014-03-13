package weiboClass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Weibo�࣬���ڴ�Ż�����Ϣ����Ȩ��
 * @author zice
 *
 */
public class Weibo {
	private String content;  //΢������
	private Date date;    //΢������
	private String score;   //΢���ķ����ֵ
	private String topic;   //΢���Ĺؼ���
	private String mid; //΢����mid
	private String usrId;  //΢���û���id
	private ArrayList<String> words; // �ִʺ�Ĵ���
	
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public Weibo(){
		this.content = "";
		this.date = null;
		this.score = null;
		this.topic = "";
		this.mid=null;
		
	}
	/**
	 * ��΢�����ݵĹ���
	 * @param content ��ʼ����΢������
	 */
	public Weibo(String content){
		this();
		this.content = content;
	}
	
	/**
	 * ��΢�����ݼ�����ʱ��Ĺ���
	 * @param content ��ʼ����΢������
	 * @param createdate ��ʼ����΢��ʱ��
	 */
	public Weibo(String mid,String content,Date createdate){
		this(content);
		setMid(mid);
		setDate(createdate);
	}
	
	public String getContent() {
		return content;
	}
	
   /**
    * ����΢��������
    * @param content
    */
	public void setContent(String content) {
		this.content=content;
	}

	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * ���Weibo�����������Ϣ(����+ʱ��+����+����)
	 */
	public String toString(){
		StringBuilder str=new StringBuilder("mid:"+mid+"\n"+date+"\n"+content+"\n");
		return str.toString();
	}
	
	
	//For test
	public static void main(String[] args){
//		 String str="ashjahsjah#����˼#������";
		 String str="��֪΢#12#������־ԶTHU��һ��΢��";
		 Weibo test=new  Weibo(str);
		 System.out.println(test.toString());
	}

	//����΢����Ψһ��ʶ
	public void setMid(String mid) {
		this.mid = mid;
	}

	//��ȡ΢����Ψһ��ʶ
	public String getMid() {
		return mid;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String id) {
		this.usrId = id;
	}
	/**
	 * ��ȡ�ִʽ��
	 * @return
	 */
	public ArrayList<String> getWords() {
		return words;
	}
	/**
	 * ����ִʽ��
	 * @param words
	 */
	public void setWords(ArrayList<String> words) {
		this.words = words;
	}
}
