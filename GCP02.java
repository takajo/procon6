import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GCP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Deque<Character> deque = new ArrayDeque<>();
		deque.push(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (deque.size() == 0) {
				deque.push(str.charAt(i));
			} else {
				if (deque.getFirst() == 'G' && str.charAt(i) == 'C') {
					deque.pop();
				} else if (deque.getFirst() == 'C' && str.charAt(i) == 'P') {
					deque.pop();
				} else if (deque.getFirst() == 'P' && str.charAt(i) == 'G') {
					deque.pop();
				} else {
					deque.push(str.charAt(i));
				}
			}
		}
		System.out.println(deque.size());
	}
}


/*
 * import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GCP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Deque<Character> deque = new ArrayDeque<>();
		deque.push(str.charAt(0));
		int i = 0;
		while(i < str.length()) {
			if (deque.size() == 0) {
				deque.push(str.charAt(i));
			} else {
				if (deque.getFirst() == 'G' && str.charAt(i) == 'C') {
					deque.pop();
				} else if (deque.getFirst() == 'C' && str.charAt(i) == 'P') {
					deque.pop();
				} else if (deque.getFirst() == 'P' && str.charAt(i) == 'G') {
					deque.pop();
				} else {
					deque.push(str.charAt(i));
				}
			}
			i++;
		}
		System.out.println(deque.size());
	}
}


*/
/*
import java.util.Scanner;

public class GCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        boolean b = true;

        ContinueTest:
        while (b) {
            for (int i = 1; i < sb.length(); i++) {
                if ((sb.charAt(i - 1) == 'G') && (sb.charAt(i) == 'C')) {
                    sb.delete(i - 1, i + 1);
                    continue ContinueTest;
                } else if ((sb.charAt(i - 1) == 'C') && (sb.charAt(i) == 'P')) {
                    sb.delete(i - 1, i + 1);
                    continue ContinueTest;
                } else if ((sb.charAt(i - 1) == 'P') && (sb.charAt(i) == 'G')) {
                    sb.delete(i - 1, i + 1);
                    continue ContinueTest;
                }
            }
            int cnt = 1;
            for (int j = 1; j < sb.length(); j++) {
                if ((sb.charAt(j - 1) == 'G') && (sb.charAt(j) != 'C')) {
                    cnt++;
                } else if ((sb.charAt(j - 1) == 'C') && (sb.charAt(j) != 'P')) {
                    cnt++;
                } else if ((sb.charAt(j - 1) == 'P') && (sb.charAt(j) != 'G')) {
                    cnt++;
                }
            }
            if (cnt == sb.length())
                b = false;
        }
        System.out.println(sb.length());
    }
}
*/
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < str.length(); i++) list.add(str.substring(i, i+1));
		//
		System.out.println(str);
		System.out.println(list);
		System.out.println();

		for (int i = 1; i < list.size(); i++) {
			if ((list.get(i-1) == "G") && (list.get(i) == "C")) {
				list.remove(i-1);
				list.remove(i);
			} else if ((list.get(i-1) == "C") && (list.get(i) == "P")) {
				list.remove(i-1);
				list.remove(i);
			} else if ((list.get(i-1) == "P") && (list.get(i) == "G")) {
				list.remove(i-1);
				list.remove(i);
			}

			System.out.println(list);
		}

		System.out.println(list.size());
	}
}


 */

/*
import java.util.Scanner;

public class GCP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean b = true;

		System.out.println("test");

		while (b) {
			for (int i = 1; i < str.length(); i++) {
				if ((str.charAt(i - 1) == 'G') && (str.charAt(i) == 'C')) {
					str = str.substring(i - 1, i + 1);
				} else if ((str.charAt(i - 1) == 'C') && (str.charAt(i) == 'P')) {
					str = str.substring(i - 1, i + 1);
				} else if ((str.charAt(i - 1) == 'P') && (str.charAt(i) == 'G')) {
					str = str.substring(i - 1, i + 1);
				}

				System.out.println(str);
			}
			*/
/*
int cnt = 2;
for (int j = 1; j < str.length(); j++) {
	if ((str.charAt(j - 1) == 'G') && (str.charAt(j) != 'C')) {
		 cnt++;
	} else if ((str.charAt(j - 1) == 'C') && (str.charAt(j) != 'P')) {
		 cnt++;
	} else if ((str.charAt(j - 1) == 'P') && (str.charAt(j) != 'G')) {
		 cnt++;
	}
	if(cnt == str.length()) b = false;
}
*//*
	}

	System.out.println(str.length());
	}
	}

	*/

/*
import java.util.Scanner;

public class GCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = true;

        while (b) {
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == 'G') && (str.charAt(i + 1) == 'C')) {
                    str = str.substring(i, i + 1);
                } else if ((str.charAt(i) == 'C') && (str.charAt(i + 1) == 'P')) {
                    str = str.substring(i, i + 1);
                } else if ((str.charAt(i) == 'P') && (str.charAt(i + 1) == 'G')) {
                    str = str.substring(i, i + 1);
                }
            }
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) == 'G') && (str.charAt(j + 1) == 'C')) {
                    b = false;
                } else if ((str.charAt(j) == 'C') && (str.charAt(j + 1) == 'P')) {
                    b = false;
                } else if ((str.charAt(j) == 'P') && (str.charAt(j + 1) == 'G')) {
                    b = false;
                }
            }
        }

        System.out.println(str.length());
    }

}
*/

/*

import java.util.Scanner;

public class GCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = true;

        while (b) {
            for (int i = 0; i < str.length(); i++) {
                if (((str.charAt(i) == 'G') && (str.charAt(i + 1) == 'C'))
                        || ((str.charAt(i) == 'C') && (str.charAt(i + 1) == 'P'))
                        || ((str.charAt(i) == 'P') && (str.charAt(i + 1) == 'G'))) {
                    str = str.substring(i, i + 1);
                }
            }
            for (int j = 0; j < str.length(); j++) {
                if (((str.charAt(j) == 'G') && (str.charAt(j + 1) == 'C'))
                        || ((str.charAt(j) == 'C') && (str.charAt(j + 1) == 'P'))
                        || ((str.charAt(j) == 'P') && (str.charAt(j + 1) == 'G'))) {
                    b = false;
                }
            }
        }

        System.out.println(str.length());
    }

}

*/