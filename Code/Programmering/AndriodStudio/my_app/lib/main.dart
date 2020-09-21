import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:my_app/regner.dart';

void main() {
  runApp(
    MaterialApp(
      home: MyApp(),
    ),
  );
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  Calculate numbers = new Calculate();
  int tal = 0;
  int plus;
  void number(int num) {
    setState(() {
      if (plus == 1) {
        tal = tal + num;
      } else if (plus == 0) {
        tal = tal - num;
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.teal.shade900,
      appBar: AppBar(
        backgroundColor: Colors.blue.shade900,
        title: Text('Lommeregner'),
      ),
      body: Container(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Container(
              child: Text(
                '$tal',
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 50.0,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            SizedBox(
              height: 100.0,
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                FlatButton(
                  onPressed: () {
                    number(1);
                  },
                  child: Text(
                    '1',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(2);
                  },
                  child: Text(
                    '2',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(3);
                  },
                  child: Text(
                    '3',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                FlatButton(
                  onPressed: () {
                    number(4);
                  },
                  child: Text(
                    '4',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(5);
                  },
                  child: Text(
                    '5',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(6);
                  },
                  child: Text(
                    '6',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                FlatButton(
                  onPressed: () {
                    number(7);
                  },
                  child: Text(
                    '7',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(8);
                  },
                  child: Text(
                    '8',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    number(9);
                  },
                  child: Text(
                    '9',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                FlatButton(
                  onPressed: () {
                    plus = 0;
                  },
                  child: Text(
                    '-',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    setState(() {
                      tal = 0;
                    });
                  },
                  child: Text(
                    '0',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
                SizedBox(
                  width: 20.0,
                ),
                FlatButton(
                  onPressed: () {
                    plus = 1;
                  },
                  child: Text(
                    '+',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                  color: Colors.blue.shade900,
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
