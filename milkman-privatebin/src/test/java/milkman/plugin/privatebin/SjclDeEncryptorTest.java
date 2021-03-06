package milkman.plugin.privatebin;

import org.junit.jupiter.api.Test;

import milkman.plugin.privatebin.PrivateBinApi.PrivateBinData;

class SjclDeEncryptorTest {

	@Test
	void testEncryption() throws Exception {
		SjclDeEncryptor sut = new SjclDeEncryptor();
		PrivateBinData data = sut.encrypt("test");
		System.out.println(data);
	}


	@Test
	void testDecryption() throws Exception {
		String secret64 = "KEreOsL0dxwUTvtKoj1nFuNkzKb7adJcQrzgTeSJSD8=";
		PrivateBinData data = new PrivateBinData("Vlw/sC8aXrwJyJ9wTtdw9Q==", 1, 10000, 256, 128, "gcm", "", "aes", "rrOClBKft3U=", "0HeMzIwJ/C0QFuIJ7+EOC0TWmY4=", null);

		SjclDeEncryptor sut = new SjclDeEncryptor();
		String decrypted = sut.decrypt(data, secret64);
		System.out.println(decrypted);
	}
}
