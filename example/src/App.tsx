import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { moveToBackground } from 'react-native-move-to-background';

export default function App() {
  React.useEffect(() => {
    setTimeout(() => {
      moveToBackground();
    }, 6000);
  }, []);

  return (
    <View style={styles.container}>
      <Text>This app will disapear in 6s</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
