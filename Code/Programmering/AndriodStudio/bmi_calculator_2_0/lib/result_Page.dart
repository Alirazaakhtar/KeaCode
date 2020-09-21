import 'package:bmi_calculator_2_0/Constants.dart';
import 'package:bmi_calculator_2_0/bottom_button.dart';
import 'package:bmi_calculator_2_0/calculator_Brian.dart';
import 'package:bmi_calculator_2_0/reusableCard.dart';
import 'package:flutter/material.dart';

class ResultPage extends StatelessWidget {
  ResultPage({this.bmiType, this.bmiNumber, this.bmiText});

  final String bmiType;
  final String bmiNumber;
  final String bmiText;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.black54,
        title: Text('BMI CALCULATOR'),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          Container(
            margin: EdgeInsets.all(25.0),
            child: Center(
              child: Text(
                'Your Result',
                style: TextStyle(
                  fontSize: 50.0,
                  fontWeight: FontWeight.w900,
                ),
              ),
            ),
          ),
          Expanded(
            flex: 5,
            child: ReusableCard(
                cardChild: Column(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: <Widget>[
                    Text(
                      bmiType,
                      style: kResultTextStyle,
                    ),
                    Text(
                      bmiNumber,
                      style: kBMITextStyle,
                    ),
                    Text(
                      bmiText,
                      style: kBodyTextStyle,
                      textAlign: TextAlign.center,
                    ),
                  ],
                ),
                colour: kContainerColor),
          ),
          BottomButton(
            name: 'RE_CALCULATE',
            tap: () {
              Navigator.pop(context);
            },
          ),
        ],
      ),
    );
  }
}
