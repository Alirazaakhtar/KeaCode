import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.black,
        appBar: AppBar(
          title: Center(child: Text("I Am poor")),
          backgroundColor: Colors.orangeAccent,
        ),
        body: Center(
          child: Image(
            image:
                AssetImage('images/20698-7-mario-transparent-background.png'),
          ),
        ),
        floatingActionButton: FloatingActionButton(onPressed: () {}),
      ),
    ),
  );
}
