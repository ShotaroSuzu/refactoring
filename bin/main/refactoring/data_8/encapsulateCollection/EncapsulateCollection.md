# Collectionのカプセル化
メソッドがコレクションを返しているとき、
読み取り専用のビューを返して、追加と削除のメソッドを提供する

## 概要
- コレクションに対する追加と削除のメソッドを加える
- フィールドを空のコレクションで初期化
- setメソッドの呼び出しを探して、setメソッドから追加・削除メソッドを呼ぶか、クライアントから追加・削除メソッドを呼ぶ
- 置き換える目的に応じてsetメソッドの名前を変更する
- コレクションを変更するgetメソッドの呼び出しを探し、追加・削除メソッドに置き換える
- getメソッドがコレクションの読み取り専用ビューを返すようにする
- getメソッドの利用箇所を探し、本来コレクションを保持するオブジェクトにあるべきコードを探し、メソッドの移動を行う

## Eclipseのショートカット
- Ctrl + Alt + M : メソッドの抽出


## Collectionのカプセル化のメリット
- 依存関係を減らせる
- Collectionを保持しているクラス以外からの変更がないため安心して読める/修正できる

## GuavaのImmutableライブラリ
[Guava](https://github.com/google/guava/wiki)にはCollectionのカプセル化のために利用できるImmutable Collectionsライブラリがあります。  

[参考](https://github.com/google/guava/wiki/ImmutableCollectionsExplained)


今回のリファクタリングの背景詳細は Guava wiki の [Why](https://github.com/google/guava/wiki/ImmutableCollectionsExplained#why) 
を読んでみてください。
 