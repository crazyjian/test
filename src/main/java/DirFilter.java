import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DirFilter implements FilenameFilter  {
	
	private Pattern pattern;
	
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).find();
	}
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	
	public static void main(String args[]) {
		String str = "sssp";
	    // 正则表达式规则
	    String regEx = "^sp*";
	    // 编译正则表达式
	    Pattern pattern = Pattern.compile(regEx);
	    // 忽略大小写的写法
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(str);
	    // 查找字符串中是否有匹配正则表达式的字符/字符串
	    boolean rs = matcher.find();
	    System.out.println(rs);
	}
	
}
