## 기능 목록
- [x] 자동차 이름 요청 메시지 출력
- [x] 자동차 이름 입력 받기
  - [x] 쉼표로 구분 됐는지 입력값 검증
    - [x] 잘못된 입력의 경우 에러 문구 출력 및 재시도
  - [x] 이름의 길이가 5자 이하인지 검증
    - [x] 5자 초과의 경우 에러 문구 출력 및 재시도
  - [x] 중복되는 이름이 있는지 검증
    - [x] 중복시 에러 문구 출력 및 재시도
- [x] 시도 회수 요청 메시지 출력
- [x] 시도 회수 입력 받기
  - [x] 입력값 숫자인지 검증
- [x] 자동차 이동
  - [x] 차수별 이동
  - [x] 차수별 현황 출력
- [x] 최종 우승자 선정
  - [x] 최종 우승자 안내 문구 출력
    - [x] 공동 우승자의 경우 ", " 로 구분하여 출력

## 구현 클래스 목록
- CarController
  - play()

- InputView
  - readCars()
  - readTryCount()

- InputManager
  - readCars()
  - readTryCount()

- InputValidator
  - validateCars()
  - validateTryCount()

- Car
  - move()
  - getPosition()
  - getName()
  - hasMaxPosition()
  - getCurrentStatus()

- Cars
  - getNumberOfCars()
  - moveAll()
  - findWinners()
  - getCurrentDirection()

- OutputView
  - printCarRequest()
  - printTryCountRequest()
  - printCurrentDirection()
  - printWinnerCars()

- CarService
  - saveCars()
  - saveTryCount()
  - findTryCount()
  - move()
  - findWinnerCars()

- CarRepository
  - saveCars()
  - saveTryCount()
  - findCars()
  - findTryCount()

- TryCount
  - hasNext()

- RandomMoveGenerator
  - generate

## 열거형 목록
- ErrorMessage
- GameMessage
- MoveStatus
