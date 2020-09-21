import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Qazaa Calculator'),
      ),
      body: Column(
        children: <Widget>[
          Container(
            color: Colors.red,
            child: Row(
              children: <Widget>[
                FlatButton(
                  onPressed: () {},
                  child: Text("hvad"),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
