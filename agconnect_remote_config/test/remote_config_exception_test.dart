/*
 * Copyright 2021-2023. Huawei Technologies Co., Ltd. All rights reserved.
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

import 'package:agconnect_remote_config/agconnect_remote_config.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  test('exceptionWithThrottle', () {
    var exception = RemoteConfigException(code:1,message: "test",throttleEndTimeMillis: 0);
      expect("Exception: code : 1 , message: test. throttle time 0 milliseconds", exception.toString());
  });

  test('exception throttle null', () {
    var exception = RemoteConfigException(code:1,message: "test",throttleEndTimeMillis: null);
    expect("Exception: code : 1 , message: test.", exception.toString());
  });
}