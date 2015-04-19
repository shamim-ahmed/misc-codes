#include <iostream>
#include <cstring>
#include <sstream>

using namespace std;

int MAX_LENGTH = 1000000;
bool checkInterval(char*, int, int, int);

int main() {
	string line;
	char input[MAX_LENGTH];
	int count = 0;

	while (getline(cin, line)) {
		int len = line.length();

		if (len == 0) {
			break;
		}

		count++;
		strcpy(input, line.c_str());

		getline(cin, line);
		istringstream iss(line);
		int n;
		iss >> n;
		cout << "Case " << count << ":" << endl;

		for (int i = 0; i < n; i++) {
			getline(cin, line);
			istringstream indexStream(line);
			int p, q;
			indexStream >> p;
			indexStream >> q;

			bool result = checkInterval(input, len, p, q);

			if (result) {
				cout << "Yes" << endl;
			} else {
				cout << "No" << endl;
			}
		}
	}
}

bool checkInterval(char* inputChars, int arrayLength, int p, int q) {
	if (p >= arrayLength || q >= arrayLength) {
		return false;
	}

	if (p == q) {
		return true;
	}

	int start, end;

	if (p < q) {
		start = p;
		end = q;
	} else {
		start = q;
		end = p;
	}

	bool result = true;
	char valueToCheck = inputChars[start];

	for (int i = start + 1; i <= end; i++) {
		if (valueToCheck != inputChars[i]) {
			result = false;
			break;
		}
	}

	return result;
}
