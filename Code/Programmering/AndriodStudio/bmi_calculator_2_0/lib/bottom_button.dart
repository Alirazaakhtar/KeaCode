import 'package:bmi_calculator_2_0/Constants.dart';
import 'package:flutter/material.dart';

class BottomButton extends StatelessWidget {
  BottomButton({this.name, this.tap});

  final String name;
  final Function tap;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: tap,
      child: Container(
        height: 60.0,
        width: double.infinity,
        padding: EdgeInsets.only(
          bottom: 5.0,
        ),
        margin: EdgeInsets.only(top: 5.0),
        color: Color(0XFFEB1111),
        child: Center(
          child: Text(
            name,
            style: kLargeButton,
          ),
        ),
      ),
    );
  }
}
