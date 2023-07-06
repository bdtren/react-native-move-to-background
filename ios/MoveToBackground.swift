@objc(MoveToBackground)
class MoveToBackground: NSObject {

  @objc(moveToBackground:withRejecter:)
  func moveToBackground(resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
      DispatchQueue.main.async {
          let application = UIApplication.shared
          let suspend = #selector(URLSessionTask.suspend)
          application.sendAction(suspend, to: application, from: nil, for: nil)
      }
    
    resolve(true)
  }
}
