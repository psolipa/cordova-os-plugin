var exec = require('cordova/exec');

var DeviceInfoPlugin = {
    getDeviceInfo: function(successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'DeviceInfoPlugin', 'getDeviceInfo', []);
    }
};

module.exports = DeviceInfoPlugin;