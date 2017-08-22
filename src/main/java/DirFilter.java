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
	    // ������ʽ����
	    String regEx = "^sp*";
	    // ����������ʽ
	    Pattern pattern = Pattern.compile(regEx);
	    // ���Դ�Сд��д��
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(str);
	    // �����ַ������Ƿ���ƥ��������ʽ���ַ�/�ַ���
	    boolean rs = matcher.find();
	    System.out.println(rs);
	}
	
}
