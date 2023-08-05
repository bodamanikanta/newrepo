import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRML{
    public static void main(String[] args) {
        Tags first = new Tags("Start", 0);
        accept(first);
        //printList(first);
        queries(first);
    }
    public static void accept(Tags first) {
        Tags current = first;
        String cmd, token = "";
        int i;
        char ch, mode;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the commands : ");
        while (true) {
            cmd = in.nextLine();
            if (cmd.equalsIgnoreCase("Over"))
                break;
            if (cmd.charAt(0) != '<' || cmd.charAt(cmd.length() - 1) != '>') {
                System.out.println("Syntax Error");
                System.exit(-1);
            }
            cmd = cmd.substring(0, cmd.length() - 1) + " >";
            if (cmd.charAt(1) == '/') {
                if (current.last == null) {
                    break;
                } else {
                    current = current.last;
                }
            } else {
                mode = 't';
                for (i = 1; i < cmd.length(); i++) {
                    ch = cmd.charAt(i);
                    if (ch != ' ')
                        token += ch;
                    else {
                        if (token.equals("=")) {
                            continue;
                        } else if (mode == 't') {
                            Tags temp = new Tags(token);
                            temp.last = current;
                            current.inherit.add(temp);
                            current = current.inherit.get(current.inherit.size() - 1);
                            token = "";
                            mode = 'h';
                        } else if (mode == 'h') {
                            current.heading.add(token);
                            token = "";
                            mode = 'v';
                        } else {
                            current.value.add(reduce(token));
                            token = "";
                            mode = 'h';
                        }
                    }
                }
            }
        }
    }

    private static void queries(Tags first) {
        Scanner in = new Scanner(System.in);
        Tags current;
        String query, token = "";
        char ch;
        int i, j, f;
        System.out.println("Enter Queries : ");
        while (true) {
            query = in.nextLine();
            current = first;
            if (query.equalsIgnoreCase("Over"))
                break;
            else {
                query += " ";
                for (i = 0; i < query.length(); i++) {
                    ch = query.charAt(i);
                    if (ch == '.' || ch == '~') {
                        f = 0;
                        for (j = 0; j < current.inherit.size(); j++) {
                            if (reduce(current.inherit.get(j).name).equalsIgnoreCase(token)) {
                                current = current.inherit.get(j);
                                token = "";
                                f = 1;
                                break;
                            }
                        }
                        if (f == 0) {
                            System.out.println("Invalid Prompt!");
                            token = "";
                            break;
                        }
                    } else if (ch == ' ') {
                        f = 0;
                        for (j = 0; j < current.heading.size(); j++) {
                            if (current.heading.get(j).equalsIgnoreCase(token)) {
                                System.out.println(current.value.get(j).substring(1));
                                token = "";
                                f = 1;
                                break;
                            }
                        }
                        if (f == 0) {
                            System.out.println("Invalid Prompt!");
                            token = "";
                            break;
                        }
                    } else
                        token += ch;
                }
            }
        }
    }

    private static String reduce(String token) {
        int i;
        StringBuilder s = new StringBuilder();
        char ch;
        for (i = 0; i < token.length(); i++) {
            ch = token.charAt(i);
            if (ch != '>' && ch != '"')
                s.append(ch);
        }
        return s.toString();
    }

    private static void printList(Tags obj) {
        int i;
        System.out.println(obj.name);
        System.out.println(obj.heading);
        System.out.println(obj.value);
        System.out.println();
        System.out.println();
        for (i = 0; i < obj.inherit.size(); i++) {
            printList(obj.inherit.get(i));
        }
    }
}

class Tags {
    String name;
    List<String> heading;
    List<String> value;
    List<Tags> inherit;
    Tags last;

    public Tags(String name) {
        this.name = name;
        heading = new ArrayList<String>();
        value = new ArrayList<String>();
        inherit = new ArrayList<Tags>();
        last = null;
    }

    public Tags(String name, int ignoredX) {
        this.name = name;
        heading = null;
        value = null;
        inherit = new ArrayList<Tags>();
        last = null;
    }
}

