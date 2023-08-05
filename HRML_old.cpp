#include <iostream>
#include <stdio.h>
#include <vector>
#include <sstream>

using namespace std;

class Tags {
public:
    string name;
    vector<string> heading;
    vector<string> value;
    vector<Tags*> inherit;
    Tags* last;

    Tags(string name) {
        this->name = name;
        last = nullptr;
    }

    Tags(string name, int ignoredX) {
        this->name = name;
        last = nullptr;
    }
};

void accept(Tags* first);
void queries(Tags* first);
string reduce(string token);

int com,que;

int main() {
    Tags* first = new Tags("Start");
    scanf("%d %d",&com,&que);
    accept(first);
    queries(first);

    return 0;
}

void accept(Tags* first) {
    Tags* current = first;
    string cmd, token = "";
    int i,k;
    char ch, mode;
    getline(cin,cmd);
    for(k=1;k<=com;k++) {
        getline(cin, cmd);
        /* if (cmd[0] != '<' || cmd[cmd.length() - 1] != '>')
        {
            cout << "Syntax Error" << endl;
            exit(-1);
        } */
        cmd = cmd.substr(0, cmd.length() - 1) + " >";
        if (cmd[1] == '/') {
            if (current->last == nullptr) {
                break;
            } else {
                current = current->last;
            }
        } else {
            mode = 't';
            for (i = 1; i < cmd.length(); i++) {
                ch = cmd[i];
                if (ch != ' ')
                    token += ch;
                else {
                    if (token == "=") {
                        continue;
                    } else if (mode == 't') {
                        Tags* temp = new Tags(token);
                        temp->last = current;
                        current->inherit.push_back(temp);
                        current = current->inherit[current->inherit.size() - 1];
                        token = "";
                        mode = 'h';
                    } else if (mode == 'h') {
                        current->heading.push_back(token);
                        token = "";
                        mode = 'v';
                    } else {
                        current->value.push_back(reduce(token));
                        token = "";
                        mode = 'h';
                    }
                }
            }
        }
    }
}

void queries(Tags* first) {
    Tags* current;
    string query, token = "";
    char ch;
    int i, j, f,k;
    for(k=1;k<=que;k++) {
        getline(cin, query);
        current = first;
        if (query == "Over")
            break;
        else {
            query += " ";
            for (i = 0; i < query.length(); i++) {
                ch = query[i];
                if (ch == '.' || ch == '~') {
                    f = 0;
                    for (j = 0; j < current->inherit.size(); j++) {
                        if (reduce(current->inherit[j]->name) == token) {
                            current = current->inherit[j];
                            token = "";
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        cout << "Not Found!" << endl;
                        token = "";
                        break;
                    }
                } else if (ch == ' ') {
                    f = 0;
                    for (j = 0; j < current->heading.size(); j++) {
                        if (current->heading[j] == token) {
                            cout << current->value[j].substr(1) << endl;
                            token = "";
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        cout << "Not Found!" << endl;
                        token = "";
                        break;
                    }
                } else
                    token += ch;
            }
        }
    }
}

string reduce(string token) {
    int i;
    string s = "";
    char ch;
    for (i = 0; i < token.length(); i++) {
        ch = token[i];
        if (ch != '>' && ch != '"')
            s += ch;
    }
    return s;
}
