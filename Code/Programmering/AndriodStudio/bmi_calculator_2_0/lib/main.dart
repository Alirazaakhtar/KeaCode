import 'package:flutter/material.dart';
import 'HomePage.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.dark().copyWith(
        primaryColor: Color(0xFF0A0E81),
        accentColor: Color(0xFF0A0E81),
        scaffoldBackgroundColor: Color(0xFF0A0E21),
      ),
      home: HomePage(),
    );
  }
}
