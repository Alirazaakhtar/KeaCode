import 'package:bmi_calculator_2_0/Constants.dart';
import 'package:bmi_calculator_2_0/Icon_content.dart';
import 'package:bmi_calculator_2_0/bottom_button.dart';
import 'package:bmi_calculator_2_0/calculator_Brian.dart';
import 'package:bmi_calculator_2_0/result_Page.dart';
import 'package:bmi_calculator_2_0/reusableCard.dart';
import 'package:bmi_calculator_2_0/roundButton.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

enum Gender { male, female }

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int height = 170;
  int weight = 70;
  int age = 19;

  Color maleCardColor = kInactiveContainer;
  Color femaleCardColor = kInactiveContainer;

  void updateColor(Gender selectedGender) {
    if (selectedGender == Gender.male) {
      if (maleCardColor == kInactiveContainer) {
        maleCardColor = kContainerColor;
        femaleCardColor = kInactiveContainer;
      } else
        maleCardColor = kInactiveContainer;
    }

    if (selectedGender == Gender.female) {
      if (femaleCardColor == kInactiveContainer) {
        femaleCardColor = kContainerColor;
        maleCardColor = kInactiveContainer;
      } else
        femaleCardColor = kInactiveContainer;
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: Text('BMI CALCULATOR'),
        ),
      ),
      body: Column(
        children: <Widget>[
          Expanded(
            child: Row(
              children: <Widget>[
                Expanded(
                  child: ReusableCard(
                      cardChild: IconContent(
                          icon: FontAwesomeIcons.mars, label: 'MALE'),
                      colour: maleCardColor,
                      onPressed: () {
                        setState(() {
                          updateColor(Gender.male);
                        });
                      }),
                ),
                Expanded(
                    child: ReusableCard(
                        cardChild: IconContent(
                            icon: FontAwesomeIcons.venus, label: 'FEMALE'),
                        colour: femaleCardColor,
                        onPressed: () {
                          setState(() {
                            updateColor(Gender.female);
                          });
                        }))
              ],
            ),
          ),
          Expanded(
            child: ReusableCard(
                cardChild: Column(
                  crossAxisAlignment: CrossAxisAlignment.stretch,
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    SliderTheme(
                      data: SliderTheme.of(context).copyWith(
                        activeTrackColor: Color(0XFFEB1111),
                        inactiveTrackColor: Colors.white,
                        thumbColor: Color(0XFFEB1111),
                        overlayColor: Color(0x29EB1111),
                      ),
                      child: Slider(
                          value: height.toDouble(),
                          min: 120.0,
                          max: 220.0,
                          onChanged: (double newValue) {
                            setState(() {
                              height = newValue.toInt();
                            });
                          }),
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.baseline,
                      textBaseline: TextBaseline.alphabetic,
                      children: <Widget>[
                        Text(
                          height.toString(),
                          style: kNumberTextStyle,
                        ),
                        Text(
                          'cm',
                          style: kLabelTextStyle,
                        ),
                      ],
                    ),
                    Center(
                      child: Text(
                        'HEIGHT',
                        style: kLabelTextStyle,
                      ),
                    ),
                  ],
                ),
                colour: kContainerColor,
                onPressed: () {}),
          ),
          Expanded(
            child: Row(
              children: <Widget>[
                Expanded(
                  child: ReusableCard(
                    cardChild: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: <Widget>[
                        Text(
                          'WEIGHT',
                          style: kLabelTextStyle,
                        ),
                        Text(
                          weight.toString(),
                          style: kNumberTextStyle,
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            RoundIconButton(
                                icon: FontAwesomeIcons.plus,
                                onPressed: () {
                                  setState(() {
                                    if (weight <= 200) weight++;
                                  });
                                }),
                            SizedBox(
                              width: 10.0,
                            ),
                            RoundIconButton(
                                icon: FontAwesomeIcons.minus,
                                onPressed: () {
                                  setState(() {
                                    if (weight > 0) weight--;
                                  });
                                }),
                          ],
                        ),
                      ],
                    ),
                    colour: kContainerColor,
                  ),
                ),
                Expanded(
                  child: ReusableCard(
                    cardChild: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: <Widget>[
                        Text(
                          'AGE',
                          style: kLabelTextStyle,
                        ),
                        Text(
                          age.toString(),
                          style: kNumberTextStyle,
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            RoundIconButton(
                                icon: FontAwesomeIcons.plus,
                                onPressed: () {
                                  setState(() {
                                    if (age < 85) age++;
                                  });
                                }),
                            SizedBox(
                              width: 10.0,
                            ),
                            RoundIconButton(
                                icon: FontAwesomeIcons.minus,
                                onPressed: () {
                                  setState(() {
                                    if (age > 0) age--;
                                  });
                                }),
                          ],
                        ),
                      ],
                    ),
                    colour: kContainerColor,
                  ),
                ),
              ],
            ),
          ),
          BottomButton(
            name: 'CALCULATE',
            tap: () {
              CalculatorBrian brian =
                  new CalculatorBrian(height: height, weight: weight);
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => ResultPage(
                      bmiNumber: brian.numberBmi(),
                      bmiText: brian.textBmi(),
                      bmiType: brian.typeBmi(),
                    ),
                  ));
            },
          )
        ],
      ),
    );
  }
}
