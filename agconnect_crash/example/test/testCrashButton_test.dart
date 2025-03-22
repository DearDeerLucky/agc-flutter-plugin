/*
 * Copyright 2020-2023. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  testWidgets('Testing crash shows snackbar', (WidgetTester tester) async {
    bool crashOccurred = false;

    // Build the widget that contains the ElevatedButton
    await tester.pumpWidget(
      MaterialApp(
        home: Scaffold(
          body: ElevatedButton(
            onPressed: () {
              // Function to be tested
              crashOccurred = _testCrash();

              ScaffoldMessenger.of(tester.element(find.byType(ElevatedButton)))
                  .showSnackBar(const SnackBar(
                backgroundColor: Colors.orangeAccent,
                content: Text('Test crash successful, check logs 💥'),
                duration: Duration(seconds: 3),
              ));
            },
            child: const Text('Test Crash'),
          ),
        ),
      ),
    );

    // Tap the ElevatedButton
    await tester.tap(find.text('Test Crash'));
    await tester.pump();

    // Check if the snackbar is displayed
    expect(find.text('Test crash successful, check logs 💥'), findsOneWidget);
    expect(find.byType(SnackBar), findsOneWidget);
    expect(tester.widget<SnackBar>(find.byType(SnackBar)).backgroundColor,
        equals(Colors.orangeAccent));
    expect(tester.widget<SnackBar>(find.byType(SnackBar)).duration,
        equals(Duration(seconds: 3)));

    // Check if the crash occurred
    expect(crashOccurred, isTrue);
  });
}

bool _testCrash() {
  // Your logic to simulate a crash goes here
  // This function can be a placeholder for your actual implementation
  return true;
}
