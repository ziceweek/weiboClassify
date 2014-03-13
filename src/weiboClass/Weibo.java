package weiboClass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Weibo类，用于存放基本信息还有权重
 * @author zice
 *
 */
public class Weibo {
	private String content;  //微博内容
	private Date date;    //微博日期
	private String score;   //微博的分类分值
	private String topic;   //微博的关键词
	private String mid; //微博的mid
	private String usrId;  //微博用户的id
	private ArrayList<String> words; // 分词后的词语
	
	/**
	 * 默认构造方法
	 */
	public Weibo(){
		this.content = "";
		this.date = null;
		this.score = null;
		this.topic = "";
		this.mid=null;
		
	}
	/**
	 * 带微博内容的构造
	 * @param content 初始化的微博内容
	 */
	public Weibo(String content){
		this();
		this.content = content;
	}
	
	/**
	 * 带微博内容及创建时间的构造
	 * @param content 初始化的微博内容
	 * @param createdate 初始化的微博时间
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
    * 设置微博的内容
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
	 * 输出Weibo这个类的相关信息(内容+时间+分数+话题)
	 */
	public String toString(){
		StringBuilder str=new StringBuilder("mid:"+mid+"\n"+date+"\n"+content+"\n");
		return str.toString();
	}
	
	
	//For test
	public static void main(String[] args){
//		 String str="ashjahsjah#吴烈思#哈哈哈";
		 String str="用知微#12#分析刘志远THU的一条微博";
		 Weibo test=new  Weibo(str);
		 System.out.println(test.toString());
	}

	//设置微博的唯一标识
	public void setMid(String mid) {
		this.mid = mid;
	}

	//获取微博的唯一标识
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
	 * 获取分词结果
	 * @return
	 */
	public ArrayList<String> getWords() {
		return words;
	}
	/**
	 * 保存分词结果
	 * @param words
	 */
	public void setWords(ArrayList<String> words) {
		this.words = words;
	}
}
