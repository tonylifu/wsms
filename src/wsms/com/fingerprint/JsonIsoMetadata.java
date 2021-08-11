// Part of SourceAFIS: https://sourceafis.machinezoo.com
package wsms.com.fingerprint;

class JsonIsoMetadata {
	int width;
	int height;
	int xPixelsPerCM;
	int yPixelsPerCM;
	JsonIsoMetadata(int width, int height, int xPixelsPerCM, int yPixelsPerCM) {
		this.width = width;
		this.height = height;
		this.xPixelsPerCM = xPixelsPerCM;
		this.yPixelsPerCM = yPixelsPerCM;
	}
}
