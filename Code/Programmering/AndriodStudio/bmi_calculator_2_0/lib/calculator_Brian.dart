import 'dart:math';

class CalculatorBrian {
  final int height;
  final int weight;

  double _bmi;

  //konstruktør
  CalculatorBrian({this.height, this.weight});

  String numberBmi() {
    _bmi = weight / pow(height / 100, 2);
    return _bmi.toStringAsFixed(1);
  }

  String typeBmi() {
    if (_bmi <= 18.5) {
      return 'Underweight';
    } else if (_bmi < 25) {
      return 'Normal';
    } else {
      return 'Overweight';
    }
  }

  String textBmi() {
    if (_bmi >= 25) {
      return 'You have a higher than normal body weight. Try to exercise more.';
    } else if (_bmi > 18.5) {
      return 'You have a normal body weight. Good Job!';
    } else {
      return 'you have a lower than normal body weight. You can eat a bit more.';
    }
  }
}
