package default

import scala.collection.SortedSet

trait FrequentItemSets {
  /**
   * Collection type for frequent item sets.
   *
   * @tparam T item type.
   */
  type ItemSet[T] = SortedSet[T]
}
