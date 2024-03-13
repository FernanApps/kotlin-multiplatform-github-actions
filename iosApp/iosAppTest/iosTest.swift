import XCTest
import shared

final class iosTest: XCTestCase {

    func testPlatformNameIsCorrect() throws {
        let platformName = Main_iosKt.getPlatformName()
        print("Ejecutando la prueba para verificar el nombre de la plataforma... El nombre de la plataforma es: \(platformName)")
        XCTAssertEqual(platformName, "iOS")
    }
}
