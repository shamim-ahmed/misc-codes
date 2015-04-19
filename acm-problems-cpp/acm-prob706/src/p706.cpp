#include <iostream>
#include <sstream>

using namespace std;

void processNumber(int, string);
void printRow(string[], int, int, int);

string TERMINATING_NUBMER = "0";
string led_patterns[5][10][3] = {
      { { " ", "-", " " }, { " ", " ", " " }, { " ", "-", " " }, { " ", "-", " " }, { " ", " ", " " },
          { " ", "-", " " }, { " ", "-", " " }, { " ", "-", " " }, { " ", "-", " " }, { " ", "-", " " } },
      { { "|", " ", "|" }, { " ", " ", "|" }, { " ", " ", "|" }, { " ", " ", "|" }, { "|", " ", "|" },
          { "|", " ", " " }, { "|", " ", " " }, { " ", " ", "|" }, { "|", " ", "|" }, { "|", " ", "|" } },
      { { " ", " ", " " }, { " ", " ", " " }, { " ", "-", " " }, { " ", "-", " " }, { " ", "-", " " },
          { " ", "-", " " }, { " ", "-", " " }, { " ", " ", " " }, { " ", "-", " " }, { " ", "-", " " } },
      { { "|", " ", "|" }, { " ", " ", "|" }, { "|", " ", " " }, { " ", " ", "|" }, { " ", " ", "|" },
          { " ", " ", "|" }, { "|", " ", "|" }, { " ", " ", "|" }, { "|", " ", "|" }, { " ", " ", "|" } },
      { { " ", "-", " " }, { " ", " ", " " }, { " ", "-", " " }, { " ", "-", " " }, { " ", " ", " " },
          { " ", "-", " " }, { " ", "-", " " }, { " ", " ", " " }, { " ", "-", " " }, { " ", "-", " " } } };

int main() {
  string line;

  while (getline(cin, line)) {
    istringstream iss(line);
    int size;
    string numberStr;
    iss >> size;
    iss >> numberStr;

    if (size == 0 && numberStr == TERMINATING_NUBMER) {
      break;
    }

    processNumber(size, numberStr);
  }

  return 0;
}

void processNumber(int size, string numberStr) {
  int n = numberStr.length();

  for (int i = 0; i < 5; i++) {
    int m = (i % 2 == 0) ? 1 : size;

    for (int p = 0; p < m; p++) {
      for (int j = 0; j < n; j++) {
        int digit = numberStr.at(j) - '0';
        string patterns[3] = led_patterns[i][digit];
        printRow(patterns, size, n, j);
      }

      cout << endl;
    }
  }

  cout << endl;
}

void printRow(string patterns[], int size, int n, int j) {
  cout << patterns[0];

  for (int k = 0; k < size; k++) {
    cout << patterns[1];
  }

  cout << patterns[2];

  if (j != n - 1) {
    cout << " ";
  }
}
