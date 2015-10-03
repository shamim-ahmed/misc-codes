#include <iostream>
#include <sstream>

using namespace std;

int main() {
  string line;

  while (getline(cin, line)) {
    istringstream instream1(line);
    int n, p;
    instream1 >> n;
    instream1 >> p;

    if (n == 0 && p == 0) {
      break;
    }

    int leftIndices[n + 1];
    int rightIndices[n + 1];

    for (int i = 1; i <= n; i++) {
      leftIndices[i] = i - 1;
      rightIndices[i] = i + 1;
    }

    leftIndices[1] = 0;
    rightIndices[n] = 0;

    for (int i = 0; i < p; i++) {
      getline(cin, line);
      istringstream instream2(line);

      int a, b;
      instream2 >> a;
      instream2 >> b;

      int u = leftIndices[a];
      int v = rightIndices[b];

      leftIndices[v] = u;
      rightIndices[u] = v;

      cout << (u != 0 ? to_string(u) : "*") << " "
          << (v != 0 ? to_string(v) : "*") << endl;
    }

    cout << "-" << endl;
  }

  return 0;
}
