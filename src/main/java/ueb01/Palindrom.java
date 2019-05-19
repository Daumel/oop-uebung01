package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {

		CharStack stack = new CharStackImpl();

		s = s.toLowerCase();
		s = s.replaceAll(" ", "");

		for(char c: s.toCharArray()){
			stack.push(c);
		}
		int a = stack.size();
		String backwards = "";
		for(int i = 0; i<a; i++){
			backwards += stack.pop();
		}
		return s.equals(backwards);
	}
}
