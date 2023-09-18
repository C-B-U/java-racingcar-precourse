## 기능 목록
- [x] 자동차 이름 입력 받기
  - [x] 쉼표로 구분 됐는지 입력값 검증
    - [x] 잘못된 입력의 경우 에러 문구 출력
  - [x] 이름의 길이가 5자 이하인지 검증
    - [x] 5자 초과의 경우 에러 문구 출력
  - [ ] 중복되는 이름이 있는지 검증
    - [ ] 중복시 에러 문구 출력
- [ ] 시도 회수 입력 받기
- [ ] 자동차 이동
  - [ ] 차수별 이동
  - [ ] 차수별 현황 출력
- [ ] 최종 우승자 선정
  - [ ] 최종 우승자 안내 문구 출력
    - [ ] 공동 우승자의 경우 ", " 로 구분하여 출력

## 구현 클래스 목록
- CarController
  - play()

- InputView
  - readCars()

- InputManager
  - readCars()

- InputValidator
  - validateCars()

- Car

- Cars

## 열거형 목록
- ErrorMessage